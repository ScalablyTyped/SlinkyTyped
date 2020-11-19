organization := "org.scalablytyped.slinky"
name := "graphql-tools"
version := "6.0.15-235bf4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-613542",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-90e98e",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e30392",
  "org.scalablytyped.slinky" %%% "dataloader" % "2.0.0-f4e068",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-df6e9c",
  "org.scalablytyped.slinky" %%% "globby" % "11.0.1-becc6c",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "graphql-tools__batch-delegate" % "6.0.15-3644a4",
  "org.scalablytyped.slinky" %%% "graphql-tools__code-file-loader" % "6.0.15-d790e1",
  "org.scalablytyped.slinky" %%% "graphql-tools__delegate" % "6.0.15-7113b6",
  "org.scalablytyped.slinky" %%% "graphql-tools__git-loader" % "6.0.15-70dcc5",
  "org.scalablytyped.slinky" %%% "graphql-tools__github-loader" % "6.0.15-6dfc65",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-file-loader" % "6.0.15-0a748b",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-552d75",
  "org.scalablytyped.slinky" %%% "graphql-tools__import" % "6.0.15-0b2fdf",
  "org.scalablytyped.slinky" %%% "graphql-tools__links" % "6.0.15-e4c2a9",
  "org.scalablytyped.slinky" %%% "graphql-tools__load" % "6.0.15-c0a2b5",
  "org.scalablytyped.slinky" %%% "graphql-tools__load-files" % "6.0.15-22d957",
  "org.scalablytyped.slinky" %%% "graphql-tools__merge" % "6.0.15-e478eb",
  "org.scalablytyped.slinky" %%% "graphql-tools__mock" % "6.0.15-d5a344",
  "org.scalablytyped.slinky" %%% "graphql-tools__module-loader" % "6.0.15-7527f2",
  "org.scalablytyped.slinky" %%% "graphql-tools__relay-operation-optimizer" % "6.0.15-adb8bd",
  "org.scalablytyped.slinky" %%% "graphql-tools__resolvers-composition" % "6.0.15-2a1965",
  "org.scalablytyped.slinky" %%% "graphql-tools__schema" % "6.0.15-165fc7",
  "org.scalablytyped.slinky" %%% "graphql-tools__stitch" % "6.0.15-49e92e",
  "org.scalablytyped.slinky" %%% "graphql-tools__url-loader" % "6.0.15-1c70e8",
  "org.scalablytyped.slinky" %%% "graphql-tools__utils" % "6.0.15-219b96",
  "org.scalablytyped.slinky" %%% "graphql-tools__wrap" % "6.0.15-110c1f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-22b3f9",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-4e891a",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-150c3f",
  "org.scalablytyped.slinky" %%% "p-limit" % "3.0.2-cae372",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "websocket" % "1.0-dt-20200707Z-ff1ae8",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-d6155f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
