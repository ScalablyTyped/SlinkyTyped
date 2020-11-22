package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.OmitModalStaticFunctionsw
import typingsSlinky.antd.anon.PartialModalProps
import typingsSlinky.antd.anon.RootPrefixCls
import typingsSlinky.antd.anon.WeakValidationMapModalPro
import typingsSlinky.antd.confirmMod.ModalFunc
import typingsSlinky.antd.modalModalMod.ModalProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  
  val default: ModalType = js.native
  
  /* Inlined antd.antd/lib/modal/Modal.ModalInterface & antd.antd/lib/modal/confirm.ModalStaticFunctions & {destroyAll (): void,   config :(hasRootPrefixCls : {  rootPrefixCls :string | undefined}): void} */
  @js.native
  trait ModalType extends js.Object {
    
    def apply(props: PropsWithChildren[ModalProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[ModalProps], context: js.Any): ReactElement | Null = js.native
    
    var config: js.Function1[/* hasRootPrefixCls */ RootPrefixCls, Unit] = js.native
    
    var confirm: ModalFunc = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[PartialModalProps] = js.native
    
    def destroyAll(): Unit = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var error: ModalFunc = js.native
    
    var info: ModalFunc = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    
    var success: ModalFunc = js.native
    
    var useModal: js.Function0[js.Tuple2[OmitModalStaticFunctionsw, ReactElement]] = js.native
    
    var warn: ModalFunc = js.native
    
    var warning: ModalFunc = js.native
  }
}
