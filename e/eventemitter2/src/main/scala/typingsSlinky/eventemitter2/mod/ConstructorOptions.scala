package typingsSlinky.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  /**
    * @default '.'
    * @description the delimiter used to segment namespaces.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * @default 10
    * @description the maximum amount of listeners that can be assigned to an event.
    */
  var maxListeners: js.UndefOr[Double] = js.native
  /**
    * @default true
    * @description set this to `true` if you want to emit the newListener events.
    */
  var newListener: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
    */
  var verboseMemoryLeak: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description set this to `true` to use wildcards.
    */
  var wildcard: js.UndefOr[Boolean] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxListeners(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withNewListener(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(js.undefined)
        ret
    }
    @scala.inline
    def withVerboseMemoryLeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseMemoryLeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerboseMemoryLeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseMemoryLeak")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(js.undefined)
        ret
    }
  }
  
}

