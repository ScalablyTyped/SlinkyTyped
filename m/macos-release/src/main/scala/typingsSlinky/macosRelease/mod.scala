package typingsSlinky.macosRelease

import typingsSlinky.macosRelease.anon.Call
import typingsSlinky.macosRelease.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the name and version of a macOS release from the Darwin version.
  	@param release - By default, the current operating system is used, but you can supply a custom [Darwin kernel version](https://en.wikipedia.org/wiki/Darwin_%28operating_system%29#Release_history), which is the output of [`os.release()`](https://nodejs.org/api/os.html#os_os_release).
  	@example
  	```
  	import * as os from 'os';
  	import macosRelease = require('macos-release');
  	// On a macOS Sierra system
  	macosRelease();
  	//=> {name: 'Sierra', version: '10.12'}
  	os.release();
  	//=> 13.2.0
  	// This is the Darwin kernel version
  	macosRelease(os.release());
  	//=> {name: 'Sierra', version: '10.12'}
  	macosRelease('14.0.0');
  	//=> {name: 'Yosemite', version: '10.10'}
  	macosRelease('20.0.0');
  	//=> {name: 'Big Sur', version: '11'}
  	```
  	*/
  @JSImport("macos-release", JSImport.Namespace)
  @js.native
  def apply(): Name = js.native
  @JSImport("macos-release", JSImport.Namespace)
  @js.native
  def apply(release: String): Name = js.native
  
  @JSImport("macos-release", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Get the name and version of a macOS release from the Darwin version.
  	@param release - By default, the current operating system is used, but you can supply a custom [Darwin kernel version](https://en.wikipedia.org/wiki/Darwin_%28operating_system%29#Release_history), which is the output of [`os.release()`](https://nodejs.org/api/os.html#os_os_release).
  	@example
  	```
  	import * as os from 'os';
  	import macosRelease = require('macos-release');
  	// On a macOS Sierra system
  	macosRelease();
  	//=> {name: 'Sierra', version: '10.12'}
  	os.release();
  	//=> 13.2.0
  	// This is the Darwin kernel version
  	macosRelease(os.release());
  	//=> {name: 'Sierra', version: '10.12'}
  	macosRelease('14.0.0');
  	//=> {name: 'Yosemite', version: '10.10'}
  	macosRelease('20.0.0');
  	//=> {name: 'Big Sur', version: '11'}
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function macosRelease(release?: string): {name: string, version: string};
  // export = macosRelease;
  @JSImport("macos-release", "default")
  @js.native
  def default(): Name = js.native
  @JSImport("macos-release", "default")
  @js.native
  def default(release: String): Name = js.native
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function macosRelease(release?: string): {name: string, version: string};
  // export = macosRelease;
  @JSImport("macos-release", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
