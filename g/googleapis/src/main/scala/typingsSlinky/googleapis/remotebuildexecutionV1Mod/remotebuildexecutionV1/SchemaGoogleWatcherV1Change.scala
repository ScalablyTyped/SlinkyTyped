package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Change indicates the most recent state of an element.
  */
@js.native
trait SchemaGoogleWatcherV1Change extends js.Object {
  /**
    * If true, this Change is followed by more Changes that are in the same
    * group as this Change.
    */
  var continued: js.UndefOr[Boolean] = js.native
  /**
    * The actual change data. This field is present only when `state() ==
    * EXISTS` or `state() == ERROR`. Please see google.protobuf.Any about how
    * to use the Any type.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Name of the element, interpreted relative to the entity&#39;s actual
    * name. &quot;&quot; refers to the entity itself. The element name is a
    * valid UTF-8 string.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * If present, provides a compact representation of all the messages that
    * have been received by the caller for the given entity, e.g., it could be
    * a sequence number or a multi-part timestamp/version vector. This marker
    * can be provided in the Request message, allowing the caller to resume the
    * stream watching at a specific point without fetching the initial state.
    */
  var resumeMarker: js.UndefOr[String] = js.native
  /**
    * The state of the `element`.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleWatcherV1Change {
  @scala.inline
  def apply(): SchemaGoogleWatcherV1Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleWatcherV1Change]
  }
  @scala.inline
  implicit class SchemaGoogleWatcherV1ChangeOps[Self <: SchemaGoogleWatcherV1Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinued(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continued")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

