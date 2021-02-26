package typingsSlinky.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scratch {
  
  @js.native
  sealed trait ArgumentType extends StObject
  /** Block argument types. */
  @JSGlobal("Scratch.ArgumentType")
  @js.native
  object ArgumentType extends StObject {
    
    /** Numeric value with angle picker. */
    @js.native
    sealed trait ANGLE extends ArgumentType
    
    /** Boolean value with hexagonal placeholder. */
    @js.native
    sealed trait BOOLEAN extends ArgumentType
    
    /** Numeric value with color picker. */
    @js.native
    sealed trait COLOR extends ArgumentType
    
    /** Inline image on block (as part of the label). */
    @js.native
    sealed trait IMAGE extends ArgumentType
    
    /** String value with matrix field. */
    @js.native
    sealed trait MATRIX extends ArgumentType
    
    /** MIDI note number with note picker (piano) field. */
    @js.native
    sealed trait NOTE extends ArgumentType
    
    /** Numeric value with text field. */
    @js.native
    sealed trait NUMBER extends ArgumentType
    
    /** String value with text field. */
    @js.native
    sealed trait STRING extends ArgumentType
  }
  
  @js.native
  sealed trait BlockType extends StObject
  /** Types of blocks. */
  @JSGlobal("Scratch.BlockType")
  @js.native
  object BlockType extends StObject {
    
    /** Boolean reporter with hexagonal shape. */
    @js.native
    sealed trait BOOLEAN extends BlockType
    
    /** A button (not an actual block) for some special action, like making a variable. */
    @js.native
    sealed trait BUTTON extends BlockType
    
    /** Command block. */
    @js.native
    sealed trait COMMAND extends BlockType
    
    /**
      * Specialized command block which may or may not run a child branch.
      * The thread continues with the next block whether or not a child branch ran.
      */
    @js.native
    sealed trait CONDITIONAL extends BlockType
    
    /**
      * Specialized hat block with no implementation function.
      * This stack only runs if the corresponding event is emitted by other code.
      */
    @js.native
    sealed trait EVENT extends BlockType
    
    /** Hat block which conditionally starts a block stack. */
    @js.native
    sealed trait HAT extends BlockType
    
    /**
      * Specialized command block which may or may not run a child branch.
      * If a child branch runs, the thread evaluates the loop block again.
      */
    @js.native
    sealed trait LOOP extends BlockType
    
    /** General reporter with numeric or string value. */
    @js.native
    sealed trait REPORTER extends BlockType
  }
  
  @js.native
  sealed trait TargetType extends StObject
  /** Default types of target supported by the VM. */
  @JSGlobal("Scratch.TargetType")
  @js.native
  object TargetType extends StObject {
    
    /** Rendered target which can move, change costumes, etc. */
    @js.native
    sealed trait SPRITE extends TargetType
    
    /** Rendered target which cannot move but can change backdrops. */
    @js.native
    sealed trait STAGE extends TargetType
  }
}
