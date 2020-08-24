organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-a9f46d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-40f946",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-b1f8de",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-49beb1",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-912e09",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-98ac3e",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-110b41",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-f36b30",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-c33396",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-a8197e",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-028e72",
  "org.scalablytyped.slinky" %%% "log-update" % "4.0.0-4d8867",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200515Z-1d3bc6",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20200713Z-db4801",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.2-c2ee33",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.2-f90eab",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-a5306c",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200627Z-e8eae9",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-348c97",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-10a9ae",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200629Z-0c6bfe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
