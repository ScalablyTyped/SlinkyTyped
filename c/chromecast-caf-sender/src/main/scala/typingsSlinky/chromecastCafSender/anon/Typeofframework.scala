package typingsSlinky.chromecastCafSender.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.chrome.chrome.cast.ErrorCode
import typingsSlinky.chrome.chrome.cast.Session
import typingsSlinky.chrome.chrome.cast.media.Media
import typingsSlinky.chromecastCafSender.cast.framework.ActiveInputState
import typingsSlinky.chromecastCafSender.cast.framework.ActiveInputStateEventData
import typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadata
import typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadataEventData
import typingsSlinky.chromecastCafSender.cast.framework.ApplicationStatusEventData
import typingsSlinky.chromecastCafSender.cast.framework.CastSession
import typingsSlinky.chromecastCafSender.cast.framework.CastState
import typingsSlinky.chromecastCafSender.cast.framework.CastStateEventData
import typingsSlinky.chromecastCafSender.cast.framework.EventData
import typingsSlinky.chromecastCafSender.cast.framework.LoggerLevel
import typingsSlinky.chromecastCafSender.cast.framework.MediaSessionEventData
import typingsSlinky.chromecastCafSender.cast.framework.RemotePlayer
import typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent
import typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerController
import typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerEventType
import typingsSlinky.chromecastCafSender.cast.framework.SessionState
import typingsSlinky.chromecastCafSender.cast.framework.SessionStateEventData
import typingsSlinky.chromecastCafSender.cast.framework.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofframework extends js.Object {
  
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typingsSlinky.chromecastCafSender.cast.framework.ActiveInputStateEventData
  ] = js.native
  
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadata
  ] = js.native
  
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadataEventData
  ] = js.native
  
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationStatusEventData
  ] = js.native
  
  var CastContext: TypeofCastContext = js.native
  
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typingsSlinky.chromecastCafSender.cast.framework.CastSession
  ] = js.native
  
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typingsSlinky.chromecastCafSender.cast.framework.CastStateEventData
  ] = js.native
  
  var EventData: Instantiable1[/* type */ String, typingsSlinky.chromecastCafSender.cast.framework.EventData] = js.native
  
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typingsSlinky.chromecastCafSender.cast.framework.MediaSessionEventData
  ] = js.native
  
  var RemotePlayer: Instantiable0[typingsSlinky.chromecastCafSender.cast.framework.RemotePlayer] = js.native
  
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ] = js.native
  
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerController
  ] = js.native
  
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typingsSlinky.chromecastCafSender.cast.framework.SessionStateEventData
  ] = js.native
  
  val VERSION: String = js.native
  
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typingsSlinky.chromecastCafSender.cast.framework.VolumeEventData
  ] = js.native
  
  def setLoggerLevel(level: LoggerLevel): Unit = js.native
}
object Typeofframework {
  
  @scala.inline
  def apply(
    ActiveInputStateEventData: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData],
    ApplicationMetadata: Instantiable1[/* sessionObj */ Session, ApplicationMetadata],
    ApplicationMetadataEventData: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData],
    ApplicationStatusEventData: Instantiable1[/* status */ String, ApplicationStatusEventData],
    CastContext: TypeofCastContext,
    CastSession: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession],
    CastStateEventData: Instantiable1[/* castState */ CastState, CastStateEventData],
    EventData: Instantiable1[/* type */ String, EventData],
    MediaSessionEventData: Instantiable1[/* mediaSession */ Media, MediaSessionEventData],
    RemotePlayer: Instantiable0[RemotePlayer],
    RemotePlayerChangedEvent: Instantiable3[
      /* type */ RemotePlayerEventType, 
      /* field */ String, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
      RemotePlayerChangedEvent[js.Object]
    ],
    RemotePlayerController: Instantiable1[/* player */ RemotePlayer, RemotePlayerController],
    SessionStateEventData: Instantiable3[
      /* session */ CastSession, 
      /* sessionState */ SessionState, 
      /* opt_errorCode */ ErrorCode, 
      SessionStateEventData
    ],
    VERSION: String,
    VolumeEventData: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData],
    setLoggerLevel: LoggerLevel => Unit
  ): Typeofframework = {
    val __obj = js.Dynamic.literal(ActiveInputStateEventData = ActiveInputStateEventData.asInstanceOf[js.Any], ApplicationMetadata = ApplicationMetadata.asInstanceOf[js.Any], ApplicationMetadataEventData = ApplicationMetadataEventData.asInstanceOf[js.Any], ApplicationStatusEventData = ApplicationStatusEventData.asInstanceOf[js.Any], CastContext = CastContext.asInstanceOf[js.Any], CastSession = CastSession.asInstanceOf[js.Any], CastStateEventData = CastStateEventData.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], MediaSessionEventData = MediaSessionEventData.asInstanceOf[js.Any], RemotePlayer = RemotePlayer.asInstanceOf[js.Any], RemotePlayerChangedEvent = RemotePlayerChangedEvent.asInstanceOf[js.Any], RemotePlayerController = RemotePlayerController.asInstanceOf[js.Any], SessionStateEventData = SessionStateEventData.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], VolumeEventData = VolumeEventData.asInstanceOf[js.Any], setLoggerLevel = js.Any.fromFunction1(setLoggerLevel))
    __obj.asInstanceOf[Typeofframework]
  }
  
  @scala.inline
  implicit class TypeofframeworkOps[Self <: Typeofframework] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveInputStateEventData(value: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData]): Self = this.set("ActiveInputStateEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationMetadata(value: Instantiable1[/* sessionObj */ Session, ApplicationMetadata]): Self = this.set("ApplicationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationMetadataEventData(value: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData]): Self = this.set("ApplicationMetadataEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatusEventData(value: Instantiable1[/* status */ String, ApplicationStatusEventData]): Self = this.set("ApplicationStatusEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastContext(value: TypeofCastContext): Self = this.set("CastContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastSession(value: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession]): Self = this.set("CastSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastStateEventData(value: Instantiable1[/* castState */ CastState, CastStateEventData]): Self = this.set("CastStateEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventData(value: Instantiable1[/* type */ String, EventData]): Self = this.set("EventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSessionEventData(value: Instantiable1[/* mediaSession */ Media, MediaSessionEventData]): Self = this.set("MediaSessionEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePlayer(value: Instantiable0[RemotePlayer]): Self = this.set("RemotePlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePlayerChangedEvent(
      value: Instantiable3[
          /* type */ RemotePlayerEventType, 
          /* field */ String, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
          RemotePlayerChangedEvent[js.Object]
        ]
    ): Self = this.set("RemotePlayerChangedEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePlayerController(value: Instantiable1[/* player */ RemotePlayer, RemotePlayerController]): Self = this.set("RemotePlayerController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionStateEventData(
      value: Instantiable3[
          /* session */ CastSession, 
          /* sessionState */ SessionState, 
          /* opt_errorCode */ ErrorCode, 
          SessionStateEventData
        ]
    ): Self = this.set("SessionStateEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeEventData(value: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData]): Self = this.set("VolumeEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLoggerLevel(value: LoggerLevel => Unit): Self = this.set("setLoggerLevel", js.Any.fromFunction1(value))
  }
}
