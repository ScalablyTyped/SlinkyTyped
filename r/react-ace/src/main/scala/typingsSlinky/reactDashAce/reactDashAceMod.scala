package typingsSlinky.reactDashAce

import typingsSlinky.propDashTypes.propDashTypesMod.ValidationMap
import typingsSlinky.reactDashAce.libAceMod.IAceEditorProps
import typingsSlinky.reactDashAce.libDiffMod.IDiffEditorProps
import typingsSlinky.reactDashAce.libSplitMod.ISplitEditorProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", JSImport.Namespace)
@js.native
object reactDashAceMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.reactDashAce.libAceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  
  @js.native
  class diff protected ()
    extends typingsSlinky.reactDashAce.libDiffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  
  @js.native
  class split protected ()
    extends typingsSlinky.reactDashAce.libSplitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Partial[IAceEditorProps] = js.native
    var propTypes: ValidationMap[IAceEditorProps] = js.native
  }
  
  /* static members */
  @js.native
  object diff extends js.Object {
    var defaultProps: Partial[IDiffEditorProps] = js.native
    var propTypes: ValidationMap[IDiffEditorProps] = js.native
  }
  
  /* static members */
  @js.native
  object split extends js.Object {
    var defaultProps: Partial[ISplitEditorProps] = js.native
    var propTypes: ValidationMap[ISplitEditorProps] = js.native
  }
  
}

