package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.componentsMod.GCLock
import typingsSlinky.ipfsCore.componentsMod.IPFSBlockService
import typingsSlinky.ipfsCore.componentsMod.Pin_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcLock extends js.Object {
  
  var blockService: IPFSBlockService = js.native
  
  var gcLock: GCLock = js.native
  
  var pin: Pin_ = js.native
  
  var preload: typingsSlinky.ipfsCore.componentsMod.Preload = js.native
}
object GcLock {
  
  @scala.inline
  def apply(
    blockService: IPFSBlockService,
    gcLock: GCLock,
    pin: Pin_,
    preload: typingsSlinky.ipfsCore.componentsMod.Preload
  ): GcLock = {
    val __obj = js.Dynamic.literal(blockService = blockService.asInstanceOf[js.Any], gcLock = gcLock.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcLock]
  }
  
  @scala.inline
  implicit class GcLockOps[Self <: GcLock] (val x: Self) extends AnyVal {
    
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
    def setBlockService(value: IPFSBlockService): Self = this.set("blockService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcLock(value: GCLock): Self = this.set("gcLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Pin_): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: typingsSlinky.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
