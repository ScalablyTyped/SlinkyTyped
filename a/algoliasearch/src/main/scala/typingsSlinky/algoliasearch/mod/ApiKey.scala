package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.algoliasearchStrings.addObject
import typingsSlinky.algoliasearch.algoliasearchStrings.analytics
import typingsSlinky.algoliasearch.algoliasearchStrings.browse
import typingsSlinky.algoliasearch.algoliasearchStrings.deleteIndex
import typingsSlinky.algoliasearch.algoliasearchStrings.deleteObject
import typingsSlinky.algoliasearch.algoliasearchStrings.editSettings
import typingsSlinky.algoliasearch.algoliasearchStrings.listIndexes
import typingsSlinky.algoliasearch.algoliasearchStrings.logs
import typingsSlinky.algoliasearch.algoliasearchStrings.search
import typingsSlinky.algoliasearch.algoliasearchStrings.seeUnretrievableAttributes
import typingsSlinky.algoliasearch.algoliasearchStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKey extends js.Object {
  var acl: js.Array[
    search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
  ] = js.native
  var createdAt: Double = js.native
  var description: js.UndefOr[String] = js.native
  var indexes: js.UndefOr[js.Array[String]] = js.native
  var validity: Double = js.native
  var value: String = js.native
}

object ApiKey {
  @scala.inline
  def apply(
    acl: js.Array[
      search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
    ],
    createdAt: Double,
    validity: Double,
    value: String
  ): ApiKey = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
  @scala.inline
  implicit class ApiKeyOps[Self <: ApiKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(
      value: js.Array[
          search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
  }
  
}

