package typingsSlinky.naverWhale.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsystem extends js.Object {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  val cpu: js.Any = js.native
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  val memory: js.Any = js.native
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  val storage: js.Any = js.native
}
object Typeofsystem {
  
  @scala.inline
  def apply(cpu: js.Any, memory: js.Any, storage: js.Any): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsystem]
  }
  
  @scala.inline
  implicit class TypeofsystemOps[Self <: Typeofsystem] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: js.Any): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: js.Any): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: js.Any): Self = this.set("storage", value.asInstanceOf[js.Any])
  }
}
