package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.PartialITagInputProps
import typingsSlinky.blueprintjsCore.anon.PartialITagInputState
import typingsSlinky.blueprintjsCore.anon.ReadonlyITagInputProps
import typingsSlinky.blueprintjsCore.anon.ReadonlyITagInputState
import typingsSlinky.blueprintjsCore.tagInputMod.ITagInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "TagInput")
@js.native
class TagInput protected ()
  extends typingsSlinky.blueprintjsCore.tagInputMod.TagInput {
  def this(props: ITagInputProps) = this()
  def this(props: ITagInputProps, context: js.Any) = this()
}
/* static members */
object TagInput {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TagInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TagInput.defaultProps")
  @js.native
  def defaultProps: PartialITagInputProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialITagInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TagInput.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "TagInput.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(props: ReadonlyITagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = js.native
}
