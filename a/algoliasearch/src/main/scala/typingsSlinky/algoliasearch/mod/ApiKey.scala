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

trait ApiKey extends js.Object {
  var acl: js.Array[
    search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
  ]
  var createdAt: Double
  var description: js.UndefOr[String] = js.undefined
  var indexes: js.UndefOr[js.Array[String]] = js.undefined
  var validity: Double
  var value: String
}

object ApiKey {
  @scala.inline
  def apply(
    acl: js.Array[
      search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
    ],
    createdAt: Double,
    validity: Double,
    value: String,
    description: String = null,
    indexes: js.Array[String] = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

