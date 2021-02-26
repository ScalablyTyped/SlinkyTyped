package typingsSlinky.enhancedResolve

import typingsSlinky.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsSlinky.enhancedResolve.commonTypesMod.ResolveContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: String = js.native
    
    var flag: js.UndefOr[String] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(encoding: String): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait Flag extends StObject {
    
    var flag: js.UndefOr[String] = js.native
  }
  object Flag {
    
    @scala.inline
    def apply(): Flag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(context: ResolveContext, path: String, request: String): String = js.native
    def apply(path: String, request: String): String = js.native
  }
  
  @js.native
  trait FnCallContextPathRequestCallback extends StObject {
    
    def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
    def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  }
  
  @js.native
  trait ForceRelative extends StObject {
    
    var forceRelative: Boolean = js.native
    
    var name: String = js.native
  }
  object ForceRelative {
    
    @scala.inline
    def apply(forceRelative: Boolean, name: String): ForceRelative = {
      val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceRelative]
    }
    
    @scala.inline
    implicit class ForceRelativeMutableBuilder[Self <: ForceRelative] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceRelative(value: Boolean): Self = StObject.set(x, "forceRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Paths extends StObject {
    
    var paths: js.Array[String] = js.native
    
    var seqments: js.Array[String] = js.native
  }
  object Paths {
    
    @scala.inline
    def apply(paths: js.Array[String], seqments: js.Array[String]): Paths = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], seqments = seqments.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    @scala.inline
    implicit class PathsMutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setSeqments(value: js.Array[String]): Self = StObject.set(x, "seqments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqmentsVarargs(value: String*): Self = StObject.set(x, "seqments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Push extends StObject {
    
    def push(item: String): Unit = js.native
  }
  object Push {
    
    @scala.inline
    def apply(push: String => Unit): Push = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push]
    }
    
    @scala.inline
    implicit class PushMutableBuilder[Self <: Push] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: String => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
