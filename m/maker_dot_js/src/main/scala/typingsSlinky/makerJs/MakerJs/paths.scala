package typingsSlinky.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paths {
  
  /**
    * Class for arc path.
    */
  @js.native
  trait Arc extends IPathArc
  object Arc {
    
    @scala.inline
    def apply(endAngle: Double, origin: IPoint, radius: Double, startAngle: Double, `type`: String): Arc = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arc]
    }
  }
  
  /**
    * Class for chord, which is simply a line path that connects the endpoints of an arc.
    *
    * @param arc Arc to use as the basic for the chord.
    */
  @js.native
  trait Chord extends IPathLine
  object Chord {
    
    @scala.inline
    def apply(end: IPoint, origin: IPoint, `type`: String): Chord = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chord]
    }
  }
  
  /**
    * Class for circle path.
    */
  @js.native
  trait Circle extends IPathCircle
  object Circle {
    
    @scala.inline
    def apply(origin: IPoint, radius: Double, `type`: String): Circle = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
  }
  
  /**
    * Class for line path.
    */
  @js.native
  trait Line extends IPathLine
  object Line {
    
    @scala.inline
    def apply(end: IPoint, origin: IPoint, `type`: String): Line = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
  }
  
  /**
    * Class for a parallel line path.
    *
    * @param toLine A line to be parallel to.
    * @param distance Distance between parallel and original line.
    * @param nearPoint Any point to determine which side of the line to place the parallel.
    */
  @js.native
  trait Parallel extends IPathLine
  object Parallel {
    
    @scala.inline
    def apply(end: IPoint, origin: IPoint, `type`: String): Parallel = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parallel]
    }
  }
}
