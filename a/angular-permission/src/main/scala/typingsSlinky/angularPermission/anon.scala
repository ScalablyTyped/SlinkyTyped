package typingsSlinky.angularPermission

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angularPermission.mod.permission.PermissionRedirectConfigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Except extends StObject {
    
    var except: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
    
    var only: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
    
    var redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation] = js.native
  }
  object Except {
    
    @scala.inline
    def apply(
      redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
    ): Except = {
      val __obj = js.Dynamic.literal(redirectTo = redirectTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Except]
    }
    
    @scala.inline
    implicit class ExceptMutableBuilder[Self <: Except] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcept(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptFunction0(value: () => Unit): Self = StObject.set(x, "except", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      @scala.inline
      def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value :_*))
      
      @scala.inline
      def setOnly(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyFunction0(value: () => Unit): Self = StObject.set(x, "only", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setRedirectTo(
        value: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
      ): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectToFunction0(value: () => PermissionRedirectConfigation | String): Self = StObject.set(x, "redirectTo", js.Any.fromFunction0(value))
    }
  }
}
