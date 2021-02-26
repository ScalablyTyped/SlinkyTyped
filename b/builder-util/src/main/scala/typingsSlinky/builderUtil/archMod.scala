package typingsSlinky.builderUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archMod {
  
  @js.native
  sealed trait Arch extends StObject
  @JSImport("builder-util/out/arch", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Arch with Double] = js.native
    
    @js.native
    sealed trait arm64 extends Arch
    /* 3 */ val arm64: typingsSlinky.builderUtil.archMod.Arch.arm64 with Double = js.native
    
    @js.native
    sealed trait armv7l extends Arch
    /* 2 */ val armv7l: typingsSlinky.builderUtil.archMod.Arch.armv7l with Double = js.native
    
    @js.native
    sealed trait ia32 extends Arch
    /* 0 */ val ia32: typingsSlinky.builderUtil.archMod.Arch.ia32 with Double = js.native
    
    @js.native
    sealed trait x64 extends Arch
    /* 1 */ val x64: typingsSlinky.builderUtil.archMod.Arch.x64 with Double = js.native
  }
  
  @JSImport("builder-util/out/arch", "archFromString")
  @js.native
  def archFromString(name: String): Arch = js.native
  
  @JSImport("builder-util/out/arch", "getArchCliNames")
  @js.native
  def getArchCliNames(): js.Array[String] = js.native
  
  @JSImport("builder-util/out/arch", "getArchSuffix")
  @js.native
  def getArchSuffix(arch: Arch): String = js.native
  
  @JSImport("builder-util/out/arch", "getArtifactArchName")
  @js.native
  def getArtifactArchName(arch: Arch, ext: String): String = js.native
  
  @JSImport("builder-util/out/arch", "toLinuxArchString")
  @js.native
  def toLinuxArchString(arch: Arch, targetName: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.builderUtil.builderUtilStrings.x64
    - typingsSlinky.builderUtil.builderUtilStrings.ia32
    - typingsSlinky.builderUtil.builderUtilStrings.armv7l
    - typingsSlinky.builderUtil.builderUtilStrings.arm64
  */
  trait ArchType extends StObject
  object ArchType {
    
    @scala.inline
    def arm64: typingsSlinky.builderUtil.builderUtilStrings.arm64 = "arm64".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.arm64]
    
    @scala.inline
    def armv7l: typingsSlinky.builderUtil.builderUtilStrings.armv7l = "armv7l".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.armv7l]
    
    @scala.inline
    def ia32: typingsSlinky.builderUtil.builderUtilStrings.ia32 = "ia32".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.ia32]
    
    @scala.inline
    def x64: typingsSlinky.builderUtil.builderUtilStrings.x64 = "x64".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.x64]
  }
}
