package typingsSlinky.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FHIR Search parameter : The parameter used to by the FHIR api methods to perform search on a particular resource.
  */
@js.native
trait SearchParams extends CommonQueryFilters {
  /**
    * The patient id. If provided, will make the search query patient specific by adding the patien query parameter
    */
  var patient: js.UndefOr[String] = js.native
  /**
    * The Search filter query object
    * This object syntaxs adopts mongodb-like query syntax ([see](http://docs.mongodb.org/manual/tutorial/query-documents/)
    * eg:
    * {name: 'maud'}
    * //=> name=maud
    *
    * {name: {$exact: 'maud'}}
    * //=> name:exact=maud
    *
    * {name: {$or: ['maud','dave']}}
    * //=> name=maud,dave
    *
    * {name: {$and: ['maud',{$exact: 'dave'}]}}
    * //=> name=maud&name:exact=Dave
    *
    * {birthDate: {$gt: '1970', $lte: '1980'}}
    * //=> birthDate=gt1970&birthDate=lte1980
    *
    * {subject: {$type: 'Patient', name: 'maud', birthDate: {$gt: '1970'}}}
    * //=> subject:Patient.name=maud&subject:Patient.birthDate=gt1970
    *
    * {'subject.name': {$exact: 'maud'}}
    * //=> subject.name:exact=maud
    */
  var query: js.UndefOr[js.Any] = js.native
  /**
    * The name of the resource type on which the query is performed
    */
  var `type`: String = js.native
}

object SearchParams {
  @scala.inline
  def apply(`type`: String): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
  @scala.inline
  implicit class SearchParamsOps[Self <: SearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

