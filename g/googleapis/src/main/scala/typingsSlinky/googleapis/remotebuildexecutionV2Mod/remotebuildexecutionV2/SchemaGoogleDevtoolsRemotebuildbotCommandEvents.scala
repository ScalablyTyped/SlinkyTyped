package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommandEvents contains counters for the number of warnings and errors that
  * occurred during the execution of a command.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildbotCommandEvents extends js.Object {
  /**
    * Indicates whether we are using a cached Docker image (true) or had to
    * pull the Docker image (false) for this command.
    */
  var dockerCacheHit: js.UndefOr[Boolean] = js.native
  /**
    * The input cache miss ratio.
    */
  var inputCacheMiss: js.UndefOr[Double] = js.native
  /**
    * The number of errors reported.
    */
  var numErrors: js.UndefOr[String] = js.native
  /**
    * The number of warnings reported.
    */
  var numWarnings: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildbotCommandEvents {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandEvents]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildbotCommandEventsOps[Self <: SchemaGoogleDevtoolsRemotebuildbotCommandEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockerCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerCacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerCacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withInputCacheMiss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCacheMiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputCacheMiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCacheMiss")(js.undefined)
        ret
    }
    @scala.inline
    def withNumErrors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withNumWarnings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numWarnings")(js.undefined)
        ret
    }
  }
  
}

