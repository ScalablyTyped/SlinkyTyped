package typingsSlinky.chromecastDashCafDashSender

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.chrome.chrome.cast.ErrorCode
import typingsSlinky.chrome.chrome.cast.Session
import typingsSlinky.chrome.chrome.cast.media.Media
import typingsSlinky.chromecastDashCafDashSender.cast.framework.ActiveInputState
import typingsSlinky.chromecastDashCafDashSender.cast.framework.ActiveInputStateEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationMetadata
import typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationMetadataEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationStatusEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.CastSession
import typingsSlinky.chromecastDashCafDashSender.cast.framework.CastState
import typingsSlinky.chromecastDashCafDashSender.cast.framework.CastStateEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.EventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.LoggerLevel
import typingsSlinky.chromecastDashCafDashSender.cast.framework.MediaSessionEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayer
import typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayerChangedEvent
import typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayerController
import typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType
import typingsSlinky.chromecastDashCafDashSender.cast.framework.SessionState
import typingsSlinky.chromecastDashCafDashSender.cast.framework.SessionStateEventData
import typingsSlinky.chromecastDashCafDashSender.cast.framework.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.ApplicationStatusEventData
  ]
  var CastContext: TypeofClassCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.CastStateEventData
  ]
  var EventData: Instantiable1[
    /* type */ String, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.EventData
  ]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typingsSlinky.chromecastDashCafDashSender.cast.framework.VolumeEventData
  ]
  def setLoggerLevel(level: LoggerLevel): Unit
}

object Typeofframework {
  @scala.inline
  def apply(
    ActiveInputStateEventData: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData],
    ApplicationMetadata: Instantiable1[/* sessionObj */ Session, ApplicationMetadata],
    ApplicationMetadataEventData: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData],
    ApplicationStatusEventData: Instantiable1[/* status */ String, ApplicationStatusEventData],
    CastContext: TypeofClassCastContext,
    CastSession: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession],
    CastStateEventData: Instantiable1[/* castState */ CastState, CastStateEventData],
    EventData: Instantiable1[/* type */ String, EventData],
    MediaSessionEventData: Instantiable1[/* mediaSession */ Media, MediaSessionEventData],
    RemotePlayer: Instantiable0[RemotePlayer],
    RemotePlayerChangedEvent: Instantiable3[
      /* type */ RemotePlayerEventType, 
      /* field */ String, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
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
}

