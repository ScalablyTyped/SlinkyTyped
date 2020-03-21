package typingsSlinky.chromecastCafSender

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
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typingsSlinky.chromecastCafSender.cast.framework.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typingsSlinky.chromecastCafSender.cast.framework.ApplicationStatusEventData
  ]
  var CastContext: TypeofCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typingsSlinky.chromecastCafSender.cast.framework.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typingsSlinky.chromecastCafSender.cast.framework.CastStateEventData
  ]
  var EventData: Instantiable1[/* type */ String, typingsSlinky.chromecastCafSender.cast.framework.EventData]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typingsSlinky.chromecastCafSender.cast.framework.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typingsSlinky.chromecastCafSender.cast.framework.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typingsSlinky.chromecastCafSender.cast.framework.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typingsSlinky.chromecastCafSender.cast.framework.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typingsSlinky.chromecastCafSender.cast.framework.VolumeEventData
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
}

