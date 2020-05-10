package typingsSlinky.greasemonkey.GM

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.greasemonkey.AnonMimetype
import typingsSlinky.greasemonkey.greasemonkeyStrings.end
import typingsSlinky.greasemonkey.greasemonkeyStrings.idle
import typingsSlinky.greasemonkey.greasemonkeyStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptInfo extends js.Object {
  var description: String = js.native
  var excludes: js.Array[String] = js.native
  var includes: js.Array[String] = js.native
  var matches: js.Array[String] = js.native
  var name: String = js.native
  var namespace: js.UndefOr[String] = js.native
  /**
    * An object keyed by resource name.
    * Each value is an object with keys `name` and `mimetype` and `url`
    * with string values.
    */
  var resources: StringDictionary[AnonMimetype] = js.native
  /** @default 'end' */
  var runAt: start | end | idle = js.native
  var uuid: String = js.native
  var version: String = js.native
}

object ScriptInfo {
  @scala.inline
  def apply(
    description: String,
    excludes: js.Array[String],
    includes: js.Array[String],
    matches: js.Array[String],
    name: String,
    resources: StringDictionary[AnonMimetype],
    runAt: start | end | idle,
    uuid: String,
    version: String
  ): ScriptInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptInfo]
  }
  @scala.inline
  implicit class ScriptInfoOps[Self <: ScriptInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: StringDictionary[AnonMimetype]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunAt(value: start | end | idle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
  }
  
}

