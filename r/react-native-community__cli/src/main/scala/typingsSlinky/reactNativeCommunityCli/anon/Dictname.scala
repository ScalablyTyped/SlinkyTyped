package typingsSlinky.reactNativeCommunityCli.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigIOS
import typingsSlinky.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typingsSlinky.reactNativeCommunityCli.mod.PlatformConfig
import typingsSlinky.reactNativeCommunityCli.mod.ProjectConfigAndroid
import typingsSlinky.reactNativeCommunityCli.mod.ProjectConfigIOS
import typingsSlinky.reactNativeCommunityCli.mod.ProjectParamsAndroid
import typingsSlinky.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.native
  
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.native
}
object Dictname {
  
  @scala.inline
  def apply(): Dictname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictname]
  }
  
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
    
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
    def setAndroid(
      value: PlatformConfig[
          ProjectParamsAndroid, 
          DependencyParamsAndroid, 
          ProjectConfigAndroid, 
          DependencyConfigAndroid
        ]
    ): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setIos(value: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
}
