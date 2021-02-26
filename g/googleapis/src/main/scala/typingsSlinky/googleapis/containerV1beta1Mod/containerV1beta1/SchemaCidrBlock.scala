package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CidrBlock contains an optional name and one CIDR block.
  */
@js.native
trait SchemaCidrBlock extends StObject {
  
  /**
    * cidr_block must be specified in CIDR notation.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  
  /**
    * display_name is an optional field for users to identify CIDR blocks.
    */
  var displayName: js.UndefOr[String] = js.native
}
object SchemaCidrBlock {
  
  @scala.inline
  def apply(): SchemaCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCidrBlock]
  }
  
  @scala.inline
  implicit class SchemaCidrBlockMutableBuilder[Self <: SchemaCidrBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
