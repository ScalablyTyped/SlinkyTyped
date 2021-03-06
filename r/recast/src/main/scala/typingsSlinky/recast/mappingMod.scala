package typingsSlinky.recast

import typingsSlinky.astTypes.namedTypesMod.namedTypes.Position
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SourceLocation
import typingsSlinky.recast.linesMod.Lines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingMod {
  
  @JSImport("recast/lib/mapping", JSImport.Default)
  @js.native
  class default protected () extends Mapping {
    def this(sourceLines: Lines, sourceLoc: Loc) = this()
    def this(sourceLines: Lines, sourceLoc: Loc, targetLoc: Loc) = this()
  }
  
  type Loc = SourceLocation
  
  @js.native
  trait Mapping extends StObject {
    
    def add(line: Double, column: Double): Mapping = js.native
    
    def indent(by: Double): Mapping = js.native
    def indent(by: Double, skipFirstLine: js.UndefOr[scala.Nothing], noNegativeColumns: Boolean): Mapping = js.native
    def indent(by: Double, skipFirstLine: Boolean): Mapping = js.native
    def indent(by: Double, skipFirstLine: Boolean, noNegativeColumns: Boolean): Mapping = js.native
    
    def slice(lines: Lines, start: Pos): Mapping | Null = js.native
    def slice(lines: Lines, start: Pos, end: Pos): Mapping | Null = js.native
    
    var sourceLines: Lines = js.native
    
    var sourceLoc: Loc = js.native
    
    def subtract(line: Double, column: Double): Mapping = js.native
    
    var targetLoc: Loc = js.native
  }
  
  type Pos = Position
}
