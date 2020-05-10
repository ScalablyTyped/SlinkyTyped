package typingsSlinky.electronPackager.mod

import typingsSlinky.electronPackager.electronPackagerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L340
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OsXSignOptions * / any, 'app' | 'binaries' | 'identity' | 'platform' | 'version'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OsXSignOptions * / any[P]} */ @js.native
trait ElectronOsXSignOptions extends js.Object {
  var identity: js.UndefOr[String | `true`] = js.native
}

object ElectronOsXSignOptions {
  @scala.inline
  def apply(): ElectronOsXSignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectronOsXSignOptions]
  }
  @scala.inline
  implicit class ElectronOsXSignOptionsOps[Self <: ElectronOsXSignOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
  }
  
}

