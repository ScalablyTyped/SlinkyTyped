package typingsSlinky.reactUid

import slinky.core.ReactComponentClass
import typingsSlinky.reactUid.contextMod.UIDProps
import typingsSlinky.reactUid.controlMod.WithPrefix
import typingsSlinky.reactUid.hooksMod.SeedGenerator
import typingsSlinky.reactUid.uidcomponentMod.UID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-uid", "UIDConsumer")
  @js.native
  val UIDConsumer: ReactComponentClass[UIDProps] = js.native
  
  @JSImport("react-uid", "UIDFork")
  @js.native
  val UIDFork: ReactComponentClass[WithPrefix] = js.native
  
  @JSImport("react-uid", "UIDReset")
  @js.native
  val UIDReset: ReactComponentClass[WithPrefix] = js.native
  
  @JSImport("react-uid", "UID")
  @js.native
  class UID_ protected () extends UID {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: js.Any) = this()
  }
  
  @JSImport("react-uid", "generateUID")
  @js.native
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = js.native
  
  @JSImport("react-uid", "uid")
  @js.native
  def uid(item: js.Any): String = js.native
  @JSImport("react-uid", "uid")
  @js.native
  def uid(item: js.Any, index: Double): String = js.native
  
  @JSImport("react-uid", "useUID")
  @js.native
  def useUID(): String = js.native
  
  @JSImport("react-uid", "useUIDSeed")
  @js.native
  def useUIDSeed(): SeedGenerator = js.native
}
