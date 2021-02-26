package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.GameObjects.Components.Alpha
import typingsSlinky.phaser.Phaser.GameObjects.Components.BlendMode
import typingsSlinky.phaser.Phaser.GameObjects.Components.Depth
import typingsSlinky.phaser.Phaser.GameObjects.Components.Flip
import typingsSlinky.phaser.Phaser.GameObjects.Components.GetBounds
import typingsSlinky.phaser.Phaser.GameObjects.Components.Mask
import typingsSlinky.phaser.Phaser.GameObjects.Components.Origin
import typingsSlinky.phaser.Phaser.GameObjects.Components.Pipeline
import typingsSlinky.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsSlinky.phaser.Phaser.GameObjects.Components.Size
import typingsSlinky.phaser.Phaser.GameObjects.Components.TextureCrop
import typingsSlinky.phaser.Phaser.GameObjects.Components.Tint
import typingsSlinky.phaser.Phaser.GameObjects.Components.Transform
import typingsSlinky.phaser.Phaser.GameObjects.Components.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Image Game Object.
  * 
  * An Image is a light-weight Game Object useful for the display of static images in your game,
  * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
  * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
  * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
  */
@js.native
trait Image
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible
