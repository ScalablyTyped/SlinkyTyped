package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretKeySelector selects a key of a Secret.
  */
@js.native
trait SecretKeySelector extends js.Object {
  
  /**
    * The key of the secret to select from.  Must be a valid secret key.
    */
  var key: Input[String] = js.native
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify whether the Secret or its key must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.native
}
object SecretKeySelector {
  
  @scala.inline
  def apply(key: Input[String]): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
  
  @scala.inline
  implicit class SecretKeySelectorOps[Self <: SecretKeySelector] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptional(value: Input[Boolean]): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
