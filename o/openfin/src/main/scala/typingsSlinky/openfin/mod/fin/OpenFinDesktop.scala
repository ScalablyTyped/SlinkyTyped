package typingsSlinky.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFinDesktop extends StObject {
  
  var Application: OpenFinApplicationStatic = js.native
  
  var ExternalApplication: OpenFinExternalApplicationStatic = js.native
  
  var Frame: OpenFinFrameStatic = js.native
  
  var GlobalHotkey: OpenFinGlobalHotkey = js.native
  
  var InterApplicationBus: OpenFinInterApplicationBus = js.native
  
  var Notification: OpenFinNotificationStatic = js.native
  
  var System: OpenFinSystem = js.native
  
  var Window: OpenFinWindowStatic = js.native
  
  def main(f: js.Function0[_]): Unit = js.native
}
object OpenFinDesktop {
  
  @scala.inline
  def apply(
    Application: OpenFinApplicationStatic,
    ExternalApplication: OpenFinExternalApplicationStatic,
    Frame: OpenFinFrameStatic,
    GlobalHotkey: OpenFinGlobalHotkey,
    InterApplicationBus: OpenFinInterApplicationBus,
    Notification: OpenFinNotificationStatic,
    System: OpenFinSystem,
    Window: OpenFinWindowStatic,
    main: js.Function0[_] => Unit
  ): OpenFinDesktop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ExternalApplication = ExternalApplication.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GlobalHotkey = GlobalHotkey.asInstanceOf[js.Any], InterApplicationBus = InterApplicationBus.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], System = System.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], main = js.Any.fromFunction1(main))
    __obj.asInstanceOf[OpenFinDesktop]
  }
  
  @scala.inline
  implicit class OpenFinDesktopMutableBuilder[Self <: OpenFinDesktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: OpenFinApplicationStatic): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalApplication(value: OpenFinExternalApplicationStatic): Self = StObject.set(x, "ExternalApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: OpenFinFrameStatic): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalHotkey(value: OpenFinGlobalHotkey): Self = StObject.set(x, "GlobalHotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterApplicationBus(value: OpenFinInterApplicationBus): Self = StObject.set(x, "InterApplicationBus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: js.Function0[_] => Unit): Self = StObject.set(x, "main", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotification(value: OpenFinNotificationStatic): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: OpenFinSystem): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: OpenFinWindowStatic): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
