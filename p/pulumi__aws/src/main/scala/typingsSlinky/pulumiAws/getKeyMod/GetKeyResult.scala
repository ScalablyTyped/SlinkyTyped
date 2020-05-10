package typingsSlinky.pulumiAws.getKeyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyResult extends js.Object {
  /**
    * The date and time when the API Key was created.
    */
  val createdDate: String = js.native
  /**
    * The description of the API Key.
    */
  val description: String = js.native
  /**
    * Specifies whether the API Key is enabled.
    */
  val enabled: Boolean = js.native
  /**
    * Set to the ID of the API Key.
    */
  val id: String = js.native
  /**
    * The date and time when the API Key was last updated.
    */
  val lastUpdatedDate: String = js.native
  /**
    * Set to the name of the API Key.
    */
  val name: String = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Set to the value of the API Key.
    */
  val value: String = js.native
}

object GetKeyResult {
  @scala.inline
  def apply(
    createdDate: String,
    description: String,
    enabled: Boolean,
    id: String,
    lastUpdatedDate: String,
    name: String,
    tags: StringDictionary[js.Any],
    value: String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyResult]
  }
  @scala.inline
  implicit class GetKeyResultOps[Self <: GetKeyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

