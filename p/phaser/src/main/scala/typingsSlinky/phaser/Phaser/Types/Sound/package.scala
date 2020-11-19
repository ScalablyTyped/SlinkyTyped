package typingsSlinky.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Sound {
  
  type EachActiveSoundCallback = js.Function4[
    /* manager */ typingsSlinky.phaser.Phaser.Sound.BaseSoundManager, 
    /* sound */ typingsSlinky.phaser.Phaser.Sound.BaseSound, 
    /* index */ scala.Double, 
    /* sounds */ js.Array[typingsSlinky.phaser.Phaser.Sound.BaseSound], 
    scala.Unit
  ]
}
