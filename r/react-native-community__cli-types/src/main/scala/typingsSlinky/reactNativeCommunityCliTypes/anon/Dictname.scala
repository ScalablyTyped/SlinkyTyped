package typingsSlinky.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCliTypes.androidMod.AndroidDependencyConfig
import typingsSlinky.reactNativeCommunityCliTypes.androidMod.AndroidDependencyParams
import typingsSlinky.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typingsSlinky.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import typingsSlinky.reactNativeCommunityCliTypes.iosMod.IOSDependencyConfig
import typingsSlinky.reactNativeCommunityCliTypes.iosMod.IOSDependencyParams
import typingsSlinky.reactNativeCommunityCliTypes.iosMod.IOSProjectConfig
import typingsSlinky.reactNativeCommunityCliTypes.iosMod.IOSProjectParams
import typingsSlinky.reactNativeCommunityCliTypes.mod.PlatformConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  
  var android: PlatformConfig[
    AndroidProjectConfig, 
    AndroidProjectParams, 
    AndroidDependencyConfig, 
    AndroidDependencyParams
  ] = js.native
  
  var ios: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams] = js.native
}
object Dictname {
  
  @scala.inline
  def apply(
    android: PlatformConfig[
      AndroidProjectConfig, 
      AndroidProjectParams, 
      AndroidDependencyConfig, 
      AndroidDependencyParams
    ],
    ios: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
  ): Dictname = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
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
          AndroidProjectConfig, 
          AndroidProjectParams, 
          AndroidDependencyConfig, 
          AndroidDependencyParams
        ]
    ): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(
      value: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
    ): Self = this.set("ios", value.asInstanceOf[js.Any])
  }
}
