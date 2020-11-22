package typingsSlinky.ipfsCore.pinLsMod

import typingsSlinky.ipfsCore.ipfsCoreStrings.all
import typingsSlinky.ipfsCore.ipfsCoreStrings.direct
import typingsSlinky.ipfsCore.ipfsCoreStrings.indirect
import typingsSlinky.ipfsCore.ipfsCoreStrings.recursive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LsSettings extends js.Object {
  
  /**
    * - CIDs or IPFS paths to search for in the pinset.
    */
  var paths: js.UndefOr[js.Array[String | typingsSlinky.cids.mod.^ ]] = js.native
  
  /**
    * - Filter by this type of pin ("recursive", "direct" or "indirect")
    */
  var `type`: js.UndefOr[direct | recursive | indirect | all] = js.native
}
object LsSettings {
  
  @scala.inline
  def apply(): LsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LsSettings]
  }
  
  @scala.inline
  implicit class LsSettingsOps[Self <: LsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathsVarargs(value: (String | typingsSlinky.cids.mod.^ )*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String | typingsSlinky.cids.mod.^ ]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setType(value: direct | recursive | indirect | all): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
