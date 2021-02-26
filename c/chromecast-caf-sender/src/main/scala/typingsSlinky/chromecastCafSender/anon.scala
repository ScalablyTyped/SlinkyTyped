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
import typingsSlinky.chromecastCafSender.cast.framework.CastContext
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofCastContext extends StObject {
    
    /* static member */
    def getInstance(): CastContext = js.native
  }
  object TypeofCastContext {
    
    @scala.inline
    def apply(getInstance: () => CastContext): TypeofCastContext = {
      val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction0(getInstance))
      __obj.asInstanceOf[TypeofCastContext]
    }
    
    @scala.inline
    implicit class TypeofCastContextMutableBuilder[Self <: TypeofCastContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInstance(value: () => CastContext): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Typeofcast extends StObject {
    
    ////////////////////
    // Framework
    ////////////////////
    /**
      * Cast Application Framework
      * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
      */
    val framework: Typeofframework = js.native
  }
  object Typeofcast {
    
    @scala.inline
    def apply(framework: Typeofframework): Typeofcast = {
      val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcast]
    }
    
    @scala.inline
    implicit class TypeofcastMutableBuilder[Self <: Typeofcast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFramework(value: Typeofframework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofframework extends StObject {
    
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
    
    var CastContext: Instantiable0[typingsSlinky.chromecastCafSender.cast.framework.CastContext] with TypeofCastContext = js.native
    
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
      CastContext: Instantiable0[CastContext] with TypeofCastContext,
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
    implicit class TypeofframeworkMutableBuilder[Self <: Typeofframework] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveInputStateEventData(value: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData]): Self = StObject.set(x, "ActiveInputStateEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationMetadata(value: Instantiable1[/* sessionObj */ Session, ApplicationMetadata]): Self = StObject.set(x, "ApplicationMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationMetadataEventData(value: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData]): Self = StObject.set(x, "ApplicationMetadataEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationStatusEventData(value: Instantiable1[/* status */ String, ApplicationStatusEventData]): Self = StObject.set(x, "ApplicationStatusEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastContext(value: Instantiable0[CastContext] with TypeofCastContext): Self = StObject.set(x, "CastContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastSession(value: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession]): Self = StObject.set(x, "CastSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastStateEventData(value: Instantiable1[/* castState */ CastState, CastStateEventData]): Self = StObject.set(x, "CastStateEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventData(value: Instantiable1[/* type */ String, EventData]): Self = StObject.set(x, "EventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaSessionEventData(value: Instantiable1[/* mediaSession */ Media, MediaSessionEventData]): Self = StObject.set(x, "MediaSessionEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePlayer(value: Instantiable0[RemotePlayer]): Self = StObject.set(x, "RemotePlayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePlayerChangedEvent(
        value: Instantiable3[
              /* type */ RemotePlayerEventType, 
              /* field */ String, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
              RemotePlayerChangedEvent[js.Object]
            ]
      ): Self = StObject.set(x, "RemotePlayerChangedEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePlayerController(value: Instantiable1[/* player */ RemotePlayer, RemotePlayerController]): Self = StObject.set(x, "RemotePlayerController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionStateEventData(
        value: Instantiable3[
              /* session */ CastSession, 
              /* sessionState */ SessionState, 
              /* opt_errorCode */ ErrorCode, 
              SessionStateEventData
            ]
      ): Self = StObject.set(x, "SessionStateEventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLoggerLevel(value: LoggerLevel => Unit): Self = StObject.set(x, "setLoggerLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeEventData(value: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData]): Self = StObject.set(x, "VolumeEventData", value.asInstanceOf[js.Any])
    }
  }
}
