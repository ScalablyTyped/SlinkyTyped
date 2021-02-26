package typingsSlinky.jsondiffpatch

import typingsSlinky.jsondiffpatch.mod.DiffContext
import typingsSlinky.jsondiffpatch.mod.PatchContext
import typingsSlinky.jsondiffpatch.mod.Pipe
import typingsSlinky.jsondiffpatch.mod.ReverseContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DetectMove extends StObject {
    
    // default true, detect items moved inside the array (otherwise they will be registered as remove+add)
    var detectMove: Boolean = js.native
    
    // default false, the value of items moved is not included in deltas
    var includeValueOnMove: Boolean = js.native
  }
  object DetectMove {
    
    @scala.inline
    def apply(detectMove: Boolean, includeValueOnMove: Boolean): DetectMove = {
      val __obj = js.Dynamic.literal(detectMove = detectMove.asInstanceOf[js.Any], includeValueOnMove = includeValueOnMove.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectMove]
    }
    
    @scala.inline
    implicit class DetectMoveMutableBuilder[Self <: DetectMove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectMove(value: Boolean): Self = StObject.set(x, "detectMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeValueOnMove(value: Boolean): Self = StObject.set(x, "includeValueOnMove", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Diff extends StObject {
    
    var diff: Pipe[DiffContext] = js.native
    
    var patch: Pipe[PatchContext] = js.native
    
    var reverse: Pipe[ReverseContext] = js.native
  }
  object Diff {
    
    @scala.inline
    def apply(diff: Pipe[DiffContext], patch: Pipe[PatchContext], reverse: Pipe[ReverseContext]): Diff = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit class DiffMutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: Pipe[DiffContext]): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: Pipe[PatchContext]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverse(value: Pipe[ReverseContext]): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MinLength extends StObject {
    
    // default 60, minimum string length (left and right sides) to use text diff algorythm: google-diff-match-patch
    var minLength: Double = js.native
  }
  object MinLength {
    
    @scala.inline
    def apply(minLength: Double): MinLength = {
      val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinLength]
    }
    
    @scala.inline
    implicit class MinLengthMutableBuilder[Self <: MinLength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    }
  }
}
