organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-32130e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-83448f",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-08f2a7",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-9956a8",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-d49bc9",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-27bd25",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-d28411",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-66feb9",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-9f3a16",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-6072ee",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-04fc07",
  "org.scalablytyped.slinky" %%% "log-update" % "4.0.0-9635df",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200515Z-d0476b",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20200713Z-31bddb",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.2-a28e73",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.2-e25fd9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-042d84",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200627Z-c6139c",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-32d342",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-1a5702",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200629Z-5fdf7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
