package typingsSlinky.reapop

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reapop.actionsMod.DismissNotificationAction
import typingsSlinky.reapop.actionsMod.DismissNotificationsAction
import typingsSlinky.reapop.actionsMod.NotificationActions
import typingsSlinky.reapop.anon.DismissNotification
import typingsSlinky.reapop.anon.PartialNotificationConfig
import typingsSlinky.reapop.fadeTransitionMod.Props
import typingsSlinky.reapop.reapopStrings.`bottom-center`
import typingsSlinky.reapop.reapopStrings.`bottom-left`
import typingsSlinky.reapop.reapopStrings.`bottom-right`
import typingsSlinky.reapop.reapopStrings.`top-center`
import typingsSlinky.reapop.reapopStrings.`top-left`
import typingsSlinky.reapop.reapopStrings.`top-right`
import typingsSlinky.reapop.reducerMod.InitReduxAction
import typingsSlinky.reapop.themesTypesMod.Theme
import typingsSlinky.reapop.typesMod.Notification
import typingsSlinky.reapop.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def FadeTransition(props: Props): ReactElement = js.native
  
  def GrowTransition(props: typingsSlinky.reapop.growTransitionMod.Props): ReactElement = js.native
  
  def NotificationsProvider(props: typingsSlinky.reapop.notificationsProviderMod.Props): ReactElement = js.native
  
  def SlideTransition(props: typingsSlinky.reapop.slideTransitionMod.Props): ReactElement = js.native
  
  val atalhoTheme: Theme = js.native
  
  val bootstrapTheme: Theme = js.native
  
  def default(props: typingsSlinky.reapop.notificationsSystemMod.Props): ReactElement = js.native
  
  def dismissNotification(notificationId: String): DismissNotificationAction = js.native
  
  def dismissNotifications(): DismissNotificationsAction = js.native
  
  def reducer(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = js.native
  
  def setUpNotifications(props: PartialNotificationConfig): Unit = js.native
  
  def useNotifications(): DismissNotification = js.native
  
  val wyboTheme: Theme = js.native
  
  @js.native
  object POSITIONS extends js.Object {
    
    var bottomCenter: `bottom-center` = js.native
    
    var bottomLeft: `bottom-left` = js.native
    
    var bottomRight: `bottom-right` = js.native
    
    var topCenter: `top-center` = js.native
    
    var topLeft: `top-left` = js.native
    
    var topRight: `top-right` = js.native
  }
  
  @js.native
  object STATUSES extends js.Object {
    
    var error: typingsSlinky.reapop.reapopStrings.error = js.native
    
    var info: typingsSlinky.reapop.reapopStrings.info = js.native
    
    var loading: typingsSlinky.reapop.reapopStrings.loading = js.native
    
    var none: typingsSlinky.reapop.reapopStrings.none = js.native
    
    var success: typingsSlinky.reapop.reapopStrings.success = js.native
    
    var warning: typingsSlinky.reapop.reapopStrings.warning = js.native
  }
  
  @js.native
  object baseTheme extends js.Object {
    
    def container(position: Position): CSSProperties = js.native
  }
}
