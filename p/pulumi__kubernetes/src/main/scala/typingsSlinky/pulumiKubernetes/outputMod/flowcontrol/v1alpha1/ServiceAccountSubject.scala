package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountSubject holds detailed information for service-account-kind subject.
  */
@js.native
trait ServiceAccountSubject extends js.Object {
  
  /**
    * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
    */
  var name: String = js.native
  
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  var namespace: String = js.native
}
object ServiceAccountSubject {
  
  @scala.inline
  def apply(name: String, namespace: String): ServiceAccountSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountSubject]
  }
  
  @scala.inline
  implicit class ServiceAccountSubjectOps[Self <: ServiceAccountSubject] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
}
