package typingsSlinky.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /** Indicate the scope for a reporter's value. */
  @JSGlobal("ReporterScope")
  @js.native
  object ReporterScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.scratchEnv.ReporterScope with String] = js.native
    
    /* "global" */ val GLOBAL: typingsSlinky.scratchEnv.ReporterScope.GLOBAL with String = js.native
    
    /* "target" */ val TARGET: typingsSlinky.scratchEnv.ReporterScope.TARGET with String = js.native
  }
  
  object Scratch {
    
    /** Block argument types. */
    @JSGlobal("Scratch.ArgumentType")
    @js.native
    object ArgumentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.scratchEnv.Scratch.ArgumentType with String] = js.native
      
      /* "angle" */ val ANGLE: typingsSlinky.scratchEnv.Scratch.ArgumentType.ANGLE with String = js.native
      
      /* "Boolean" */ val BOOLEAN: typingsSlinky.scratchEnv.Scratch.ArgumentType.BOOLEAN with String = js.native
      
      /* "color" */ val COLOR: typingsSlinky.scratchEnv.Scratch.ArgumentType.COLOR with String = js.native
      
      /* "image" */ val IMAGE: typingsSlinky.scratchEnv.Scratch.ArgumentType.IMAGE with String = js.native
      
      /* "matrix" */ val MATRIX: typingsSlinky.scratchEnv.Scratch.ArgumentType.MATRIX with String = js.native
      
      /* "note" */ val NOTE: typingsSlinky.scratchEnv.Scratch.ArgumentType.NOTE with String = js.native
      
      /* "number" */ val NUMBER: typingsSlinky.scratchEnv.Scratch.ArgumentType.NUMBER with String = js.native
      
      /* "string" */ val STRING: typingsSlinky.scratchEnv.Scratch.ArgumentType.STRING with String = js.native
    }
    
    /** Types of blocks. */
    @JSGlobal("Scratch.BlockType")
    @js.native
    object BlockType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.scratchEnv.Scratch.BlockType with String] = js.native
      
      /* "Boolean" */ val BOOLEAN: typingsSlinky.scratchEnv.Scratch.BlockType.BOOLEAN with String = js.native
      
      /* "button" */ val BUTTON: typingsSlinky.scratchEnv.Scratch.BlockType.BUTTON with String = js.native
      
      /* "command" */ val COMMAND: typingsSlinky.scratchEnv.Scratch.BlockType.COMMAND with String = js.native
      
      /* "conditional" */ val CONDITIONAL: typingsSlinky.scratchEnv.Scratch.BlockType.CONDITIONAL with String = js.native
      
      /* "event" */ val EVENT: typingsSlinky.scratchEnv.Scratch.BlockType.EVENT with String = js.native
      
      /* "hat" */ val HAT: typingsSlinky.scratchEnv.Scratch.BlockType.HAT with String = js.native
      
      /* "loop" */ val LOOP: typingsSlinky.scratchEnv.Scratch.BlockType.LOOP with String = js.native
      
      /* "reporter" */ val REPORTER: typingsSlinky.scratchEnv.Scratch.BlockType.REPORTER with String = js.native
    }
    
    /** Default types of target supported by the VM. */
    @JSGlobal("Scratch.TargetType")
    @js.native
    object TargetType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.scratchEnv.Scratch.TargetType with String] = js.native
      
      /* "sprite" */ val SPRITE: typingsSlinky.scratchEnv.Scratch.TargetType.SPRITE with String = js.native
      
      /* "stage" */ val STAGE: typingsSlinky.scratchEnv.Scratch.TargetType.STAGE with String = js.native
    }
    
    object extensions {
      
      /** Register an extension. */
      @JSGlobal("Scratch.extensions.register")
      @js.native
      def register(extension: typingsSlinky.scratchEnv.ScratchExtension): Unit = js.native
    }
  }
  
  @JSGlobal("ScratchExtension")
  @js.native
  class ScratchExtension ()
    extends typingsSlinky.scratchEnv.ScratchExtension
}
