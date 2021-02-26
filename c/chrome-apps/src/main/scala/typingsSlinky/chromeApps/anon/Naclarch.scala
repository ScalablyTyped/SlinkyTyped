package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.MIPS
import typingsSlinky.chromeApps.chromeAppsStrings.MIPS64
import typingsSlinky.chromeApps.chromeAppsStrings.X86_32
import typingsSlinky.chromeApps.chromeAppsStrings.X86_64
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-32`
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-64`
import typingsSlinky.chromeApps.chromeAppsStrings.arm_
import typingsSlinky.chromeApps.chromeAppsStrings.mips64_
import typingsSlinky.chromeApps.chromeAppsStrings.mips_
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Naclarch extends StObject {
  
  var nacl_arch: ToStringLiteral[
    ARM, 
    /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    Exclude[
      /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      mips64_ | arm_ | `x86-64` | `x86-32` | mips_
    ]
  ] = js.native
  
  var sub_package_path: String = js.native
}
object Naclarch {
  
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[
      ARM, 
      /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      Exclude[
        /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
        mips64_ | arm_ | `x86-64` | `x86-32` | mips_
      ]
    ],
    sub_package_path: String
  ): Naclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Naclarch]
  }
  
  @scala.inline
  implicit class NaclarchMutableBuilder[Self <: Naclarch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNacl_arch(
      value: ToStringLiteral[
          ARM, 
          /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.anon.ARM */ typingsSlinky.chromeApps.chromeAppsStrings.ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_package_path(value: String): Self = StObject.set(x, "sub_package_path", value.asInstanceOf[js.Any])
  }
}
