package typingsSlinky.appBuilderLib.fileMatcherMod

import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileMatchersOptions extends js.Object {
  val customBuildOptions: PlatformSpecificBuildOptions = js.native
  val defaultSrc: String = js.native
  val globalOutDir: String = js.native
  def macroExpander(pattern: String): String = js.native
}

object GetFileMatchersOptions {
  @scala.inline
  def apply(
    customBuildOptions: PlatformSpecificBuildOptions,
    defaultSrc: String,
    globalOutDir: String,
    macroExpander: String => String
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions.asInstanceOf[js.Any], defaultSrc = defaultSrc.asInstanceOf[js.Any], globalOutDir = globalOutDir.asInstanceOf[js.Any], macroExpander = js.Any.fromFunction1(macroExpander))
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
  @scala.inline
  implicit class GetFileMatchersOptionsOps[Self <: GetFileMatchersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomBuildOptions(value: PlatformSpecificBuildOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBuildOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalOutDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacroExpander(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macroExpander")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

