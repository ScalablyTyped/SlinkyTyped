package typingsSlinky.apolloReactHoc

import slinky.core.ReactComponentClass
import typingsSlinky.apolloReactCommon.parserMod.IDocumentDefinition
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hoc/lib/hoc-utils", JSImport.Namespace)
@js.native
object hocUtilsMod extends js.Object {
  
  def calculateVariablesFromProps[TProps](operation: IDocumentDefinition, props: TProps): Record[String, _] = js.native
  
  def defaultMapPropsToOptions(): js.Object = js.native
  
  def defaultMapPropsToSkip(): Boolean = js.native
  
  def defaultMapResultToProps[P](props: P): P = js.native
  
  def getDisplayName[P](WrappedComponent: ReactComponentClass[P]): String = js.native
  
  @js.native
  class GraphQLBase[TProps, TChildProps, TState] protected ()
    extends Component[TProps, TState, js.Any] {
    def this(props: TProps) = this()
    
    def getWrappedInstance(): js.UndefOr[ReactComponentClass[TChildProps]] = js.native
    
    def setWrappedInstance(ref: ReactComponentClass[TChildProps]): Unit = js.native
    
    var withRef: Boolean = js.native
    
    var wrappedInstance: js.Any = js.native
  }
  
  type RefSetter[TChildProps] = js.Function1[/* ref */ ReactComponentClass[TChildProps], Unit]
}
