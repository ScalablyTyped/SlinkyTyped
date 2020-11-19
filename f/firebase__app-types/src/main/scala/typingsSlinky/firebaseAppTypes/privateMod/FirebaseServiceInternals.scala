package typingsSlinky.firebaseAppTypes.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseServiceInternals extends js.Object {
  
  /**
    * Delete the service and free it's resources - called from
    * app.delete().
    */
  def delete(): js.Promise[Unit] = js.native
}
object FirebaseServiceInternals {
  
  @scala.inline
  def apply(delete: () => js.Promise[Unit]): FirebaseServiceInternals = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[FirebaseServiceInternals]
  }
  
  @scala.inline
  implicit class FirebaseServiceInternalsOps[Self <: FirebaseServiceInternals] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
  }
}
