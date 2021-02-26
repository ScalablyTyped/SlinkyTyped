package typingsSlinky.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptors[Options, ScreenProps] extends StObject {
  
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      js.Object, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ] = js.native
  
  var navigationConfig: Options = js.native
  
  var screenProps: js.UndefOr[ScreenProps] = js.native
}
object Descriptors {
  
  @scala.inline
  def apply[Options, ScreenProps](
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        js.Object, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigationConfig: Options
  ): Descriptors[Options, ScreenProps] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[Options, ScreenProps]]
  }
  
  @scala.inline
  implicit class DescriptorsMutableBuilder[Self <: Descriptors[_, _], Options, ScreenProps] (val x: Self with (Descriptors[Options, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            js.Object, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationConfig(value: Options): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
  }
}
