package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentDefaultVersionDescription extends js.Object {
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.native
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.native
}

object DocumentDefaultVersionDescription {
  @scala.inline
  def apply(): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
  @scala.inline
  implicit class DocumentDefaultVersionDescriptionOps[Self <: DocumentDefaultVersionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVersion(value: DocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVersionName(value: DocumentVersionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

