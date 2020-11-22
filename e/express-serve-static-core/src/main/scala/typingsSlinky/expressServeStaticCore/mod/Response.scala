package typingsSlinky.expressServeStaticCore.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[ResBody, StatusCode /* <: Double */]
  extends ServerResponse
     with typingsSlinky.expressServeStaticCore.mod.global.Express.Response {
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Application = js.native
  
  /**
    * Appends the specified value to the HTTP response header field.
    * If the header is not already set, it creates the header with the specified value.
    * The value parameter can be a string or an array.
    *
    * Note: calling res.set() after res.append() will reset the previously-set header value.
    *
    * @since 4.11.0
    */
  def append(field: String): this.type = js.native
  def append(field: String, value: String): this.type = js.native
  def append(field: String, value: js.Array[String]): this.type = js.native
  
  /**
    * Set _Content-Disposition_ header to _attachment_ with optional `filename`.
    */
  def attachment(): this.type = js.native
  def attachment(filename: String): this.type = js.native
  
  var charset: String = js.native
  
  /** Clear cookie `name`. */
  def clearCookie(name: String): this.type = js.native
  def clearCookie(name: String, options: js.Any): this.type = js.native
  
  /**
    * Set _Content-Type_ response header with `type` through `mime.lookup()`
    * when it does not contain "/", or set the Content-Type to `type` otherwise.
    *
    * Examples:
    *
    *     res.type('.html');
    *     res.type('html');
    *     res.type('json');
    *     res.type('application/json');
    *     res.type('png');
    */
  def contentType(`type`: String): this.type = js.native
  
  /**
    * Set cookie `name` to `val`, with the given `options`.
    *
    * Options:
    *
    *    - `maxAge`   max-age in milliseconds, converted to `expires`
    *    - `signed`   sign the cookie
    *    - `path`     defaults to "/"
    *
    * Examples:
    *
    *    // "Remember Me" for 15 minutes
    *    res.cookie('rememberme', '1', { expires: new Date(Date.now() + 900000), httpOnly: true });
    *
    *    // save as above
    *    res.cookie('rememberme', '1', { maxAge: 900000, httpOnly: true })
    */
  def cookie(name: String, `val`: String, options: CookieOptions): this.type = js.native
  def cookie(name: String, `val`: js.Any): this.type = js.native
  def cookie(name: String, `val`: js.Any, options: CookieOptions): this.type = js.native
  
  /**
    * Transfer the file at the given `path` as an attachment.
    *
    * Optionally providing an alternate attachment `filename`,
    * and optional callback `fn(err)`. The callback is invoked
    * when the data transfer is complete, or when an error has
    * ocurred. Be sure to check `res.headersSent` if you plan to respond.
    *
    * The optional options argument passes through to the underlying
    * res.sendFile() call, and takes the exact same parameters.
    *
    * This method uses `res.sendfile()`.
    */
  def download(path: String): Unit = js.native
  def download(path: String, filename: String): Unit = js.native
  def download(path: String, filename: String, fn: Errback): Unit = js.native
  def download(path: String, filename: String, options: js.Any): Unit = js.native
  def download(path: String, filename: String, options: js.Any, fn: Errback): Unit = js.native
  def download(path: String, fn: Errback): Unit = js.native
  
  /**
    * Respond to the Acceptable formats using an `obj`
    * of mime-type callbacks.
    *
    * This method uses `req.accepted`, an array of
    * acceptable types ordered by their quality values.
    * When "Accept" is not present the _first_ callback
    * is invoked, otherwise the first match is used. When
    * no match is performed the server responds with
    * 406 "Not Acceptable".
    *
    * Content-Type is set for you, however if you choose
    * you may alter this within the callback using `res.type()`
    * or `res.set('Content-Type', ...)`.
    *
    *    res.format({
    *      'text/plain': function(){
    *        res.send('hey');
    *      },
    *
    *      'text/html': function(){
    *        res.send('<p>hey</p>');
    *      },
    *
    *      'appliation/json': function(){
    *        res.send({ message: 'hey' });
    *      }
    *    });
    *
    * In addition to canonicalized MIME types you may
    * also use extnames mapped to these types:
    *
    *    res.format({
    *      text: function(){
    *        res.send('hey');
    *      },
    *
    *      html: function(){
    *        res.send('<p>hey</p>');
    *      },
    *
    *      json: function(){
    *        res.send({ message: 'hey' });
    *      }
    *    });
    *
    * By default Express passes an `Error`
    * with a `.status` of 406 to `next(err)`
    * if a match is not made. If you provide
    * a `.default` callback it will be invoked
    * instead.
    */
  def format(obj: js.Any): this.type = js.native
  
  /** Get value for header `field`. */
  def get(field: String): String = js.native
  
  def header(field: String): this.type = js.native
  def header(field: String, value: String): this.type = js.native
  def header(field: String, value: js.Array[String]): this.type = js.native
  def header(field: js.Any): this.type = js.native
  
  /**
    * Send JSON response.
    *
    * Examples:
    *
    *     res.json(null);
    *     res.json({ user: 'tj' });
    *     res.status(500).json('oh noes!');
    *     res.status(404).json('I dont have that');
    */
  def json(): this.type = js.native
  def json(body: ResBody): this.type = js.native
  /**
    * Send JSON response.
    *
    * Examples:
    *
    *     res.json(null);
    *     res.json({ user: 'tj' });
    *     res.status(500).json('oh noes!');
    *     res.status(404).json('I dont have that');
    */
  @JSName("json")
  var json_Original: Send[ResBody, this.type] = js.native
  
  /**
    * Send JSON response with JSONP callback support.
    *
    * Examples:
    *
    *     res.jsonp(null);
    *     res.jsonp({ user: 'tj' });
    *     res.status(500).jsonp('oh noes!');
    *     res.status(404).jsonp('I dont have that');
    */
  def jsonp(): this.type = js.native
  def jsonp(body: ResBody): this.type = js.native
  /**
    * Send JSON response with JSONP callback support.
    *
    * Examples:
    *
    *     res.jsonp(null);
    *     res.jsonp({ user: 'tj' });
    *     res.status(500).jsonp('oh noes!');
    *     res.status(404).jsonp('I dont have that');
    */
  @JSName("jsonp")
  var jsonp_Original: Send[ResBody, this.type] = js.native
  
  /**
    * Set Link header field with the given `links`.
    *
    * Examples:
    *
    *    res.links({
    *      next: 'http://api.example.com/users?page=2',
    *      last: 'http://api.example.com/users?page=5'
    *    });
    */
  def links(links: js.Any): this.type = js.native
  
  var locals: Record[String, _] = js.native
  
  /**
    * Set the location header to `url`.
    *
    * The given `url` can also be the name of a mapped url, for
    * example by default express supports "back" which redirects
    * to the _Referrer_ or _Referer_ headers or "/".
    *
    * Examples:
    *
    *    res.location('/foo/bar').;
    *    res.location('http://example.com');
    *    res.location('../login'); // /blog/post/1 -> /blog/login
    *
    * Mounting:
    *
    *   When an application is mounted and `res.location()`
    *   is given a path that does _not_ lead with "/" it becomes
    *   relative to the mount-point. For example if the application
    *   is mounted at "/blog", the following would become "/blog/login".
    *
    *      res.location('login');
    *
    *   While the leading slash would result in a location of "/login":
    *
    *      res.location('/login');
    */
  def location(url: String): this.type = js.native
  
  def redirect(status: Double, url: String): Unit = js.native
  /**
    * Redirect to the given `url` with optional response `status`
    * defaulting to 302.
    *
    * The resulting `url` is determined by `res.location()`, so
    * it will play nicely with mounted apps, relative paths,
    * `"back"` etc.
    *
    * Examples:
    *
    *    res.redirect('/foo/bar');
    *    res.redirect('http://example.com');
    *    res.redirect(301, 'http://example.com');
    *    res.redirect('http://example.com', 301);
    *    res.redirect('../login'); // /blog/post/1 -> /blog/login
    */
  def redirect(url: String): Unit = js.native
  def redirect(url: String, status: Double): Unit = js.native
  
  /**
    * Render `view` with the given `options` and optional callback `fn`.
    * When a callback function is given a response will _not_ be made
    * automatically, otherwise a response of _200_ and _text/html_ is given.
    *
    * Options:
    *
    *  - `cache`     boolean hinting to the engine it should cache
    *  - `filename`  filename of the view being rendered
    */
  def render(view: String): Unit = js.native
  def render(view: String, callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]): Unit = js.native
  def render(
    view: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]
  ): Unit = js.native
  def render(view: String, options: js.Object): Unit = js.native
  def render(
    view: String,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* html */ String, Unit]
  ): Unit = js.native
  
  /**
    * After middleware.init executed, Response will contain req property
    * See: express/lib/middleware/init.js
    */
  var req: js.UndefOr[Request[ParamsDictionary, _, _, ParsedQs]] = js.native
  
  /**
    * Send a response.
    *
    * Examples:
    *
    *     res.send(new Buffer('wahoo'));
    *     res.send({ some: 'json' });
    *     res.send('<p>some html</p>');
    *     res.status(404).send('Sorry, cant find that');
    */
  def send(): this.type = js.native
  def send(body: ResBody): this.type = js.native
  
  /**
    * Transfer the file at the given `path`.
    *
    * Automatically sets the _Content-Type_ response header field.
    * The callback `fn(err)` is invoked when the transfer is complete
    * or when an error occurs. Be sure to check `res.headersSent`
    * if you wish to attempt responding, as the header and some data
    * may have already been transferred.
    *
    * Options:
    *
    *   - `maxAge`   defaulting to 0 (can be string converted by `ms`)
    *   - `root`     root directory for relative filenames
    *   - `headers`  object of headers to serve with file
    *   - `dotfiles` serve dotfiles, defaulting to false; can be `"allow"` to send them
    *
    * Other options are passed along to `send`.
    *
    * Examples:
    *
    *  The following example illustrates how `res.sendFile()` may
    *  be used as an alternative for the `static()` middleware for
    *  dynamic situations. The code backing `res.sendFile()` is actually
    *  the same code, so HTTP cache support etc is identical.
    *
    *     app.get('/user/:uid/photos/:file', function(req, res){
    *       var uid = req.params.uid
    *         , file = req.params.file;
    *
    *       req.user.mayViewFilesFrom(uid, function(yes){
    *         if (yes) {
    *           res.sendFile('/uploads/' + uid + '/' + file);
    *         } else {
    *           res.send(403, 'Sorry! you cant see that.');
    *         }
    *       });
    *     });
    *
    * @api public
    */
  def sendFile(path: String): Unit = js.native
  def sendFile(path: String, fn: Errback): Unit = js.native
  def sendFile(path: String, options: js.Any): Unit = js.native
  def sendFile(path: String, options: js.Any, fn: Errback): Unit = js.native
  
  /**
    * Set the response HTTP status code to `statusCode` and send its string representation as the response body.
    * @link http://expressjs.com/4x/api.html#res.sendStatus
    *
    * Examples:
    *
    *    res.sendStatus(200); // equivalent to res.status(200).send('OK')
    *    res.sendStatus(403); // equivalent to res.status(403).send('Forbidden')
    *    res.sendStatus(404); // equivalent to res.status(404).send('Not Found')
    *    res.sendStatus(500); // equivalent to res.status(500).send('Internal Server Error')
    */
  def sendStatus(code: StatusCode): this.type = js.native
  
  /**
    * Send a response.
    *
    * Examples:
    *
    *     res.send(new Buffer('wahoo'));
    *     res.send({ some: 'json' });
    *     res.send('<p>some html</p>');
    *     res.status(404).send('Sorry, cant find that');
    */
  @JSName("send")
  var send_Original: Send[ResBody, this.type] = js.native
  
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, fn: Errback): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, options: js.Any): Unit = js.native
  /**
    * @deprecated Use sendFile instead.
    */
  def sendfile(path: String, options: js.Any, fn: Errback): Unit = js.native
  
  def set(field: String): this.type = js.native
  def set(field: String, value: String): this.type = js.native
  def set(field: String, value: js.Array[String]): this.type = js.native
  /**
    * Set header `field` to `val`, or pass
    * an object of header fields.
    *
    * Examples:
    *
    *    res.set('Foo', ['bar', 'baz']);
    *    res.set('Accept', 'application/json');
    *    res.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
    *
    * Aliased as `res.header()`.
    */
  def set(field: js.Any): this.type = js.native
  
  /**
    * Set status `code`.
    */
  def status(code: StatusCode): this.type = js.native
  
  /**
    * Set _Content-Type_ response header with `type` through `mime.lookup()`
    * when it does not contain "/", or set the Content-Type to `type` otherwise.
    *
    * Examples:
    *
    *     res.type('.html');
    *     res.type('html');
    *     res.type('json');
    *     res.type('application/json');
    *     res.type('png');
    */
  def `type`(`type`: String): this.type = js.native
  
  /**
    * Adds the field to the Vary response header, if it is not there already.
    * Examples:
    *
    *     res.vary('User-Agent').render('docs');
    *
    */
  def vary(field: String): this.type = js.native
}
