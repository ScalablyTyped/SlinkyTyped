organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.33.0-83b6cc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-d516b0",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-4372ab",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20191003Z-e5de5d",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-207e75",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-21aaa5",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20190909Z-8fa4ff",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.3-54aa37",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.3-14d83f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "2.3-dt-20190117Z-aab141",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-e76a7f",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-812a23")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        