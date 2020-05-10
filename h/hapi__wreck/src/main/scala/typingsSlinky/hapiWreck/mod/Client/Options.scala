package typingsSlinky.hapiWreck.mod.Client

import typingsSlinky.hapiWreck.hapiWreckStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.hapiWreck.mod.Client.request.Options
     with typingsSlinky.hapiWreck.mod.Client.read.Options {
  /**
    * An object containing the node agents used for pooling connections for `http` and `https`.
    */
  val agents: js.UndefOr[Agents] = js.native
  /**
    * Enables events.
    * 
    * @default false
    */
  val events: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  /* InferMemberOverrides */
  override val gunzip: js.UndefOr[Boolean | force] = js.native
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  /* InferMemberOverrides */
  override val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgents(value: Agents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withGunzip(value: Boolean | force): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gunzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGunzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gunzip")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

