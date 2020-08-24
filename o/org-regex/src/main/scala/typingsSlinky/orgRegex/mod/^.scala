package typingsSlinky.orgRegex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("org-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** 
  	@example
  	```
  	import orgRegex from  'org-regex';
  	orgRegex({exact: true}).test('@ava');
  	//=> true
  	'foo @ava bar @ava/init'.match(orgRegex());
  	//=> ['@ava']
  	```
  	*/
  def apply(): js.RegExp = js.native
  def apply(options: Options): js.RegExp = js.native
}

