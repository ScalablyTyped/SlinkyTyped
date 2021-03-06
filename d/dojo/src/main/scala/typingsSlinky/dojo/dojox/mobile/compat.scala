package typingsSlinky.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/compat.html
  *
  * CSS3 compatibility module.
  * This module provides to dojox/mobile support for some of the CSS3 features
  * in non-CSS3 browsers, such as IE or Firefox.
  * If you require this module, when running in a non-CSS3 browser it directly
  * replaces some of the methods of dojox/mobile classes, without any subclassing.
  * This way, HTML pages remain the same regardless of whether this compatibility
  * module is used or not.
  *
  * Example of usage:
  *
  * require([
  *     "dojox/mobile",
  *     "dojox/mobile/compat",
  *     ...
  * ], function(...){
  *     ...
  * });
  * This module also loads compatibility CSS files, which have a -compat.css
  * suffix. You can use either the <link> tag or @import to load theme
  * CSS files. Then, this module searches for the loaded CSS files and loads
  * compatibility CSS files. For example, if you load dojox/mobile/themes/iphone/iphone.css
  * in a page, this module automatically loads dojox/mobile/themes/iphone/iphone-compat.css.
  * If you explicitly load iphone-compat.css with <link> or @import,
  * this module will not load again the already loaded file.
  *
  * Note that, by default, compatibility CSS files are only loaded for CSS files located
  * in a directory containing a "mobile/themes" path. For that, a matching is done using
  * the default pattern "/\/mobile\/themes\/.*.css$/". If a custom theme is not located
  * in a directory containing this path, the data-dojo-config needs to specify a custom
  * pattern using the "mblLoadCompatPattern" configuration parameter, for instance:
  *
  * data-dojo-config="mblLoadCompatPattern: /\/mycustomtheme\/.*\.css$/"
  *
  */
@js.native
trait compat extends js.Object

