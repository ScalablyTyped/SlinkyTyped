package typingsSlinky.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.TypeofAuthorized
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import typingsSlinky.antDesignPro.authorizedRouteMod.default
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizedMod {
  
  @JSImport("ant-design-pro/lib/Authorized", JSImport.Default)
  @js.native
  def default(currentAuthority: String): TypeofAuthorized = js.native
  
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  class Authorized protected ()
    extends Component[IAuthorizedProps, js.Any, js.Any] {
    def this(props: IAuthorizedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IAuthorizedProps, context: js.Any) = this()
  }
  /* static members */
  object Authorized {
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.AuthorizedRoute")
    @js.native
    def AuthorizedRoute: Instantiable0[default] = js.native
    @scala.inline
    def AuthorizedRoute_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedRoute")(x.asInstanceOf[js.Any])
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.Secured")
    @js.native
    def Secured: typingsSlinky.antDesignPro.authorizedMod.Secured = js.native
    @scala.inline
    def Secured_=(x: Secured): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Secured")(x.asInstanceOf[js.Any])
    
    @JSImport("ant-design-pro/lib/Authorized", "Authorized.check")
    @js.native
    def check: typingsSlinky.antDesignPro.authorizedMod.check = js.native
    @scala.inline
    def check_=(x: check): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IAuthorizedProps extends StObject {
    
    var authority: typingsSlinky.antDesignPro.authorizedRouteMod.authority = js.native
    
    var noMatch: js.UndefOr[ReactElement] = js.native
  }
  object IAuthorizedProps {
    
    @scala.inline
    def apply(authority: authority): IAuthorizedProps = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAuthorizedProps]
    }
    
    @scala.inline
    implicit class IAuthorizedPropsMutableBuilder[Self <: IAuthorizedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "authority", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAuthorityVarargs(value: String*): Self = StObject.set(x, "authority", js.Array(value :_*))
      
      @scala.inline
      def setNoMatch(value: ReactElement): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMatchReactElement(value: ReactElement): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  type IReactComponent[P] = ReactComponentClass[P]
  
  type Secured = js.Function2[
    /* authority */ authority, 
    /* error */ js.UndefOr[ReactElement], 
    js.Function1[/* target */ IReactComponent[js.Any], IReactComponent[js.Any]]
  ]
  
  type check = js.Function3[
    /* authority */ authority, 
    /* target */ IReactComponent[js.Any], 
    /* Exception */ IReactComponent[js.Any], 
    IReactComponent[js.Any]
  ]
}
