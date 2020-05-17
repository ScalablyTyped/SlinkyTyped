package typingsSlinky.reactAce

import typingsSlinky.reactAce.aceMod.IAceEditorProps
import typingsSlinky.reactAce.anon.PartialIAceEditorProps
import typingsSlinky.reactAce.anon.PartialIDiffEditorProps
import typingsSlinky.reactAce.anon.PartialISplitEditorProps
import typingsSlinky.reactAce.anon.ValidationMapIAceEditorPr
import typingsSlinky.reactAce.anon.ValidationMapIDiffEditorP
import typingsSlinky.reactAce.anon.ValidationMapISplitEditor
import typingsSlinky.reactAce.diffMod.IDiffEditorProps
import typingsSlinky.reactAce.splitMod.ISplitEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.reactAce.aceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  
  @js.native
  class diff protected ()
    extends typingsSlinky.reactAce.diffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  
  @js.native
  class split protected ()
    extends typingsSlinky.reactAce.splitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: PartialIAceEditorProps = js.native
    var propTypes: ValidationMapIAceEditorPr = js.native
  }
  
  /* static members */
  @js.native
  object diff extends js.Object {
    var defaultProps: PartialIDiffEditorProps = js.native
    var propTypes: ValidationMapIDiffEditorP = js.native
  }
  
  /* static members */
  @js.native
  object split extends js.Object {
    var defaultProps: PartialISplitEditorProps = js.native
    var propTypes: ValidationMapISplitEditor = js.native
  }
  
}

