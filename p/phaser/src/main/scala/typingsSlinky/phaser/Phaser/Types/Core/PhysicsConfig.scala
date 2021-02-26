package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsConfig extends StObject {
  
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[ArcadeWorldConfig] = js.native
  
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[MatterWorldConfig] = js.native
}
object PhysicsConfig {
  
  @scala.inline
  def apply(): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsConfig]
  }
  
  @scala.inline
  implicit class PhysicsConfigMutableBuilder[Self <: PhysicsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcade(value: ArcadeWorldConfig): Self = StObject.set(x, "arcade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcadeUndefined: Self = StObject.set(x, "arcade", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMatter(value: MatterWorldConfig): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
