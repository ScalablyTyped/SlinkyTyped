package typingsSlinky.jestHasteMap.typesMod

import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`0`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`1`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`2`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`3`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`4`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`5`
import typingsSlinky.jestHasteMap.jestHasteMapStrings.Null
import typingsSlinky.jestHasteMap.jestHasteMapStrings.g
import typingsSlinky.jestHasteMap.jestHasteMapStrings.native
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HType extends js.Object {
  var DEPENDENCIES: `4` = js.native
  var DEPENDENCY_DELIM: Null = js.native
  var GENERIC_PLATFORM: g = js.native
  var ID: `0` = js.native
  var MODULE: `0` = js.native
  var MTIME: `1` = js.native
  var NATIVE_PLATFORM: native = js.native
  var PACKAGE: `1` = js.native
  var PATH: `0` = js.native
  var SHA1: `5` = js.native
  var SIZE: `2` = js.native
  var TYPE: `1` = js.native
  var VISITED: `3` = js.native
}

object HType {
  @scala.inline
  def apply(
    DEPENDENCIES: `4`,
    DEPENDENCY_DELIM: Null,
    GENERIC_PLATFORM: g,
    ID: `0`,
    MODULE: `0`,
    MTIME: `1`,
    NATIVE_PLATFORM: native,
    PACKAGE: `1`,
    PATH: `0`,
    SHA1: `5`,
    SIZE: `2`,
    TYPE: `1`,
    VISITED: `3`
  ): HType = {
    val __obj = js.Dynamic.literal(DEPENDENCIES = DEPENDENCIES.asInstanceOf[js.Any], DEPENDENCY_DELIM = DEPENDENCY_DELIM.asInstanceOf[js.Any], GENERIC_PLATFORM = GENERIC_PLATFORM.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MODULE = MODULE.asInstanceOf[js.Any], MTIME = MTIME.asInstanceOf[js.Any], NATIVE_PLATFORM = NATIVE_PLATFORM.asInstanceOf[js.Any], PACKAGE = PACKAGE.asInstanceOf[js.Any], PATH = PATH.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SIZE = SIZE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], VISITED = VISITED.asInstanceOf[js.Any])
    __obj.asInstanceOf[HType]
  }
  @scala.inline
  implicit class HTypeOps[Self <: HType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEPENDENCIES(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEPENDENCIES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEPENDENCY_DELIM(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEPENDENCY_DELIM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGENERIC_PLATFORM(value: g): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GENERIC_PLATFORM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODULE(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTIME(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MTIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNATIVE_PLATFORM(value: native): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_PLATFORM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPACKAGE(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PACKAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPATH(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA1(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIZE(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVISITED(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VISITED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

