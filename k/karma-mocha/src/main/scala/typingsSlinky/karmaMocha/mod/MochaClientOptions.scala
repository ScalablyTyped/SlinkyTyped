package typingsSlinky.karmaMocha.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.karmaMocha.karmaMochaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaClientOptions
  extends /** any supported Mocha configuration options */
/* key */ StringDictionary[js.Any] {
  /** This will be exposed in a reporter as `result.mocha.{exportedValue}` */
  var export: js.UndefOr[js.Array[String]] = js.native
  /** You can set opts to equal true then plugin will load opts from default location 'test/mocha.opts' */
  var opts: js.UndefOr[`true` | String] = js.native
}

object MochaClientOptions {
  @scala.inline
  def apply(): MochaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaClientOptions]
  }
  @scala.inline
  implicit class MochaClientOptionsOps[Self <: MochaClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExport(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withOpts(value: `true` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(js.undefined)
        ret
    }
  }
  
}

